package constants;

import server.ServerProperties;

public class JobConstants {

    public static final boolean enableJobs = true;
    public static final int jobOrder = 176;

    public enum LoginJob {

        末日反抗軍(0, JobFlag.開啟),
        冒險家(1, JobFlag.開啟),
        皇家騎士團(2, JobFlag.開啟),
        狂狼勇士(3, JobFlag.開啟),
        龍魔導士(4, JobFlag.開啟),
        精靈遊俠(5, JobFlag.開啟),
        惡魔(6, JobFlag.開啟),
        幻影俠盜(7, JobFlag.開啟),
        影武者(8, JobFlag.開啟),
        米哈逸(9, JobFlag.開啟),
        夜光(10, JobFlag.開啟),
        凱撒(11, JobFlag.開啟),
        天使破壞者(12, JobFlag.開啟),
        重砲指揮官(13, JobFlag.開啟),
        傑諾(14, JobFlag.開啟),
        神之子(15, JobFlag.開啟),
        隱月(16, JobFlag.開啟),
        蒼龍俠客(17, JobFlag.開啟),
        劍豪(18, JobFlag.開啟),
        陰陽師(19, JobFlag.開啟),
        幻獸師(20, JobFlag.開啟);
        private final int jobType, flag;

        private LoginJob(int jobType, JobFlag flag) {
            this.jobType = jobType;
            this.flag = flag.getFlag();
        }

        public int getJobType() {
            return jobType;
        }

        public int getFlag() {
            return JobFlag.valueOf(ServerProperties.getProperty("Job" + jobType, JobFlag.getByValue(flag).name())).getFlag();
        }

        public void setFlag(int info) {
            if (info == flag) {
                ServerProperties.removeProperty("Job" + jobType);
                return;
            }
            ServerProperties.setProperty("Job" + jobType, JobFlag.getByValue(info).name());
        }

        public enum JobFlag {

            關閉(0),
            開啟(1);
            private final int flag;

            private JobFlag(int flag) {
                this.flag = flag;
            }

            public int getFlag() {
                return flag;
            }

            public static JobFlag getByValue(int g) {
                for (JobFlag e : values()) {
                    if (e.getFlag() == g) {
                        return e;
                    }
                }
                return null;
            }
        }
    }
}
